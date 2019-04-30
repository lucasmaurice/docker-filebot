// Analyse and rename all tv shows
['/storage/origin/' as File].eachMediaFolder{
	rename(folder:it, output: '/storage/destination/', format: "Tv Show/{n}/{'Season '+s}/{n} - {sxe} - {t}", action: "MOVE", conflict: "OVERRIDE")
}

// A EXECUTER: 
// /opt/filebot/filebot -script /config/get_all_tvshows.groovy -r ; /opt/filebot/filebot -script fn:cleaner /storage/origin/ -r
