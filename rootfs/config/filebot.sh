#!/bin/sh

NAME=Filebot
FILE=/tmp/filebot_running

if [ -f "$FILE" ]; then
    echo "$NAME is already running."
else 
    echo "Start running $NAME."
    touch $FILE

    /opt/filebot/filebot -script /config/get_all_tvshows.groovy -r
    /opt/filebot/filebot -script fn:cleaner /storage/origin/Radarr-Movies -r
    /opt/filebot/filebot -script fn:cleaner /storage/origin/Sonarr-TvShows -r
    chown -R 1000:1000 /storage/destination
    chmod -R 775 /storage/destination

    echo "End running $NAME."
    rm $FILE
fi
