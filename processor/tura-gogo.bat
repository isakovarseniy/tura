@echo off

set DIRNAME=%~dp0%
set ROOTDIR=%DIRNAME%..
set TARGETDIR=%DIRNAME%
set TURA_HOME=%ROOTDIR%
set TURA_WORKING_DIRECTORY_PATTERN=.tura
set TURA_WORKING_DIRECTORY=%USERPROFILE%/%TURA_WORKING_DIRECTORY_PATTERN%
set HOME=%HomeDrive%%HomePath%

set file=%DIRNAME%/version.properties

For /F "tokens=1* delims==" %%A IN (%file%) DO (
    IF "%%A"=="TURA_VERSION" set TURA_VERSION=%%B
)

echo "%TURA_VERSION%"


@REM ==== START VALIDATION ====
if not "%JAVA_HOME%" == "" goto OkJHome

echo.
echo Error: JAVA_HOME not found in your environment. >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error

:OkJHome
if exist "%JAVA_HOME%\bin\java.exe" goto RUN

echo.
echo Error: JAVA_HOME is set to an invalid directory. >&2
echo JAVA_HOME = "%JAVA_HOME%" >&2
echo Please set the JAVA_HOME variable in your environment to match the >&2
echo location of your Java installation. >&2
echo.
goto error

:RUN
set JAVACMD="%JAVA_HOME%\bin\java.exe"

set opts=%JLINE_OPTS%

set "logconf=%DIRNAME%etc\logging.properties"
set cmd=
:RUN_LOOP
    if "%1" == "debug" goto :EXECUTE_DEBUG
    if "%1" == "debugs" goto :EXECUTE_DEBUGS
    if "%1" == "verbose" goto :EXECUTE_VERBOSE
    if "%1" == "" goto :EXECUTE_MAIN
	if NOT "%1"  == "" goto :EXECUTE_COMMAND
    shift
    goto :RUN_LOOP


:EXECUTE_DEBUG
    set "opts=%opts% -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"
    shift
    goto :RUN_LOOP

:EXECUTE_DEBUGS
    set "opts=%opts% -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005"
    shift
    goto :RUN_LOOP

:EXECUTE_VERBOSE
    set "logconf=%DIRNAME%etc\logging-verbose.properties"
    shift
    goto :RUN_LOOP
	
:EXECUTE_COMMAND	
    set "cmd=%cmd% %1%"
    shift
    goto :RUN_LOOP



:EXECUTE_MAIN
popd

echo JAVA : %JAVACMD%
%JAVACMD% -version


call %JAVACMD% -cp %TARGETDIR%processor-%TURA_VERSION%-jar-with-dependencies.jar;%EXTENSION%^
          %opts%^
		  -Dgosh.home=%DIRNAME%^
		  -DHOME=%HOME% -DTURA_HOME=%TURA_HOME%^
		  -DTURA_WORKING_DIRECTORY=%TURA_WORKING_DIRECTORY%^
		  -DTURA_WORKING_DIRECTORY_PATTERN=%TURA_WORKING_DIRECTORY_PATTERN%^
		  -DTURA_VERSION=%TURA_VERSION%^
		  -Djava.util.logging.config.file=%logconf%^
		  org.apache.felix.gogo.jline.TuraMain %cmd%

goto END

:error
set ERROR_CODE=1

:END
set TURA_WORKING_DIRECTORY_PATTERN=
set TURA_WORKING_DIRECTORY_PATTERN=
set TARGETDIR=
set TURA_HOME=
set EXTENSION=
set JLINE_OPTS=













