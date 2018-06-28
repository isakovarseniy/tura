#!/bin/sh

mvn clean install -DskipTests=false -Dstart.standalone.server=true  -Dtest=RunServerTest#t000_loop
