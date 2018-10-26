#!/bin/sh

mvn clean install -Ploadeddb -DskipTests=false -Dstart.standalone.server=true  -Dtest=RunServerTest#t000_loop
