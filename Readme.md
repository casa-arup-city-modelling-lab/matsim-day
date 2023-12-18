### MATSim Day :tm

Tuesday 19th December

@ Center for Advanced Spatial Analysis, University College London


### Aim of the day

The learning outcome goal is for familiarity of the key concepts and an understanding of how to go about building an open MATSim model. We will be mostly learning by doing.

This course assumes no prior knowledge of MATSim (or even transport related simulations). We will go through the main components of building a MATSim model, including the creation of a toy model in a day.

### Schedule
| Time      | Description |
| ----------- | ----------- |
| 09:30-10:00 | Introductions & aims for the day |
| 10:00-11:00 | MATSim key concepts and a little bit of theory |
| 11:00-12:00 | InstallationFest - let's get things installed |
| 12:00-13:00 | Lunchies (not provided, lots of options near by) |
| 13:00-13:30 | Building a transport network |
| 13:30-14:30 | Building a population |
| 14:30-15:00 | Break|
| 15:00-16:00 | Simulation & calibration |
| 16:00-16:45 | Validation & output analysis |

### Preparation

In order to make the most of the day some prior installation is required.

#### Docker



### Setup

#### Windows

* Install [Docker for Windows](https://docs.docker.com/desktop/install/windows-install/)
* Install [Windows Subsystem for Linux 2](https://learn.microsoft.com/en-us/windows/wsl/install)

* Open Docker desktop
	* Navigate to `Resources`, then `WSL integration` and toggle on `Ubuntu` (or whatever Distro of Linux you installed. 
	* "Apply and Restart" Docker
	* Have a cup of tea
* Boot up Docker Desktop and ensure it is running in background. 

*please* only work within WSL2, for all of our sanity! You can access the WSL2 file system by Opening Windows explorer and searching `"\\wsl$\Ubuntu\"`. Voila!

#### Mac
Congratulations on your superior choice. Most things will just work :tm

* [Docker for MacOS](https://docs.docker.com/desktop/install/mac-install/) (be careful with Apple vs Intel Silicon)
* Wait on everyone else and their faffing


#### Repositories

We will be installing a series of repositories, please install them all in one place. 

Depending on your git installation, you can clone these repos via HTTPs or SSH.

via SSH:

```
git clone git@github.com:casa-arup-city-modelling-lab/matsim-day.git
cd matsim-day
git clone git@github.com:arup-group/pam.git
git clone git@github.com:arup-group/genet.git
git clone git@github.com:arup-group/elara.git
git clone git@github.com:arup-group/londinium.git
```

via HTTPS:

```
git clone https://github.com/casa-arup-city-modelling-lab/matsim-day.git
cd matsim-day
git clone https://github.com/arup-group/pam.git
git clone https://github.com/arup-group/genet.git
git clone https://github.com/arup-group/elara.git
git clone https://github.com/arup-group/londinium.git
```

What did I just do?

* Matsim-day - this repository! Including the actual MATSim dockerfile for running our simulation.

* Londinium - Londinium is a semi-synthetic dataset for use with MATSim agent based models.

* GeNet - Network Scenario Generator

* PAM - Population Activity Modeller

* Elara - A command line utility for processing (in big batches or bit by bit) MATSim XML outputs (events or plans files) into useful tabular and geospatial outputs for analysis.

The end result, ideally, in your "matsim-day" directory on WSL2 or MacOS should look like this:

```
➜  matsim-day git:(main) ✗ tree -L 1
.
├── Dockerfile
├── Networks.md
├── Readme.md
├── elara
├── genet
├── londinium
├── pam
├── pom.xml
├── simulation.md
├── src
└── visualisation.md

6 directories, 6 files
```