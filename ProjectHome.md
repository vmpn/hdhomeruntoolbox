Small utility to create my channel data to use with xbmc.

## Pre Reqs ##
sudo apt-get install openjdk-6-jdk hdhomerun-config

## Run with the command ##
java -jar hdhomeruntoolbox.jar

## Description ##
It use tuner 1 to perform a scan, ouput is stored under "$HOME/.hdhomerun/".
Using the scan data, creates a folder "$HOME/Videos/Live TV" and creates all the strm files with the channel name. Just add this folder to XMBC Video sources.