@echo off


set ROOTDIR=%DIRNAME%..
set APP_HOME=%ROOTDIR%
set TARGETDIR=%APP_HOME%/processor-extension/target
set TURA_HOME=%APP_HOME%

set file=%DIRNAME%/version.properties

For /F "tokens=1* delims==" %%A IN (%file%) DO (
    IF "%%A"=="TURA_VERSION" set TURA_VERSION=%%B
)

echo EXTENSION VERSION %TURA_VERSION%



set JLINE_OPTS=-DAPP_HOME=%APP_HOME%
set EXTENSION=%TARGETDIR%/processor-extension.jar

%TURA_HOME%\processor\tura-gogo.bat %1

