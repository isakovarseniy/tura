# Tura application generator

Solution for generation of UI applications. 

## Pre Install

Update hosts file

```bash
127.0.0.1       kc
127.0.0.1       wf
```
Install jdk 17+

Install maven

Install docker

Install node.js

## Installation

Use git to clone source code

```bash
git clone <tura url>
```

Checkout branch

```bash
cd tura
git checkout <branch>
```
 
 Modify you startup profile
 
 ```bash
export TURA_HOME="$HOME/< path >/tura"
source $TURA_HOME/cli/etc/tura_cmd_completion
source $TURA_HOME/examples/workspaces/rest-services/etc/rest_cmd_completion
source $TURA_HOME/examples/workspaces/hr-manager/etc/hr_cmd_completion
source $TURA_HOME/examples/workspaces/sales-analyzer/etc/sa_cmd_completion
```
For MacOS 

 ```bash
launchctl setenv TURA_HOME ${HOME}/< path >

```



Build Eclipse IDE and tura

```bash
>cd $TURA_HOME/cli
>source ./etc/chx.sh 
>./etc/tura_cmd.sh buildPluginAndProcessor
>./etc/tura_cmd.sh buildPlatform

```

## Contributing
Arseniy Isakov

## License
[APACHE LICENSE, VERSION 2.0](https://www.apache.org/licenses/LICENSE-2.0)

[Eclipse Public License - v 2.0](https://www.eclipse.org/legal/epl-2.0/) 