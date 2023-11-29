### MATSim Day :tm

Tuesday 19th December

@ Center for Applied Spatial Analysis, University College London


### Aim of the day

The learning outcome goal is for familiarity of the key concepts and an understanding of how to go about building an open MATSim model. We will be mostly learning by doing.

This course assumes no prior knowledge of MATSim (or even transport related simulations). We will go through the main components of building a MATSim model, including the creation of a toy model in a day.

### Schedule
| Time      | Description |
| ----------- | ----------- |
| 09:30-10:00 | Introductions & aims for the day |
| 10:00-11:00 | MATSim key concepts and a little bit of theory|
| 11:00-12:00 | InstallationFest - let's get things installed|
| 12:00-13:00 | Lunchies (not provided, lots of options near by)|
| 13:00-13:30 | Building a transport network|
| 13:30-14:30 | Building a population|
| 14:30-15:00 | Break|
| 15:00-16:00 | Simulation & calibration|
| 16:00-16:45 | Validation & output analysis|

### Preparation

In order to make the most of the day some prior installation is required.

Install the Mamba package manager for your OS. 

### Clone some repos

`git clone git@github.com:arup-group/londinium.git`
``

## Windows
1. [Docker for Windows](https://docs.docker.com/desktop/install/windows-install/)
2. 

## Linux

## MacOS


Step 1: Build the Docker image for MATSim itself


```docker build -t "casa-matsim" .```


Step 2: go and get a cup of tea, coffee, or something stronger if Docker isn't being your friend.

Step 3: a simple test run


````docker run -v ~/londinium/:/working-dir casa-matsim com.casa.cml.RunMatsim /working-dir/matsim/hermes_matsim_config_londinium.xml``
