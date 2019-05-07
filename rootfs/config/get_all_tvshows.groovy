// Analyse and rename all tv shows
['/storage/origin/Sonarr-TvShows' as File].eachMediaFolder{
	rename(folder:it, output: '/storage/destination/', format: "Tv Show/{n}/{'Season '+s}/{n} - {sxe} - {t}", action: "MOVE", conflict: "OVERRIDE")
}

// Analyse and rename all movies
['/storage/origin/Radarr-Movies' as File].eachMediaFolder{
	rename(folder:it, output: '/storage/destination/', format: "Movies/Radarr/{ny}/{ny}", action: "MOVE", conflict: "OVERRIDE")
}
