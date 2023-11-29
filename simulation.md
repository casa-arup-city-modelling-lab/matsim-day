Step 1: Build the Docker image for MATSim itself


```docker build -t "casa-matsim" .```


Step 2: go and get a cup of tea, coffee, or something stronger if Docker isn't being your friend.

Step 3: a simple test run


``docker run -v ~/londinium/:/working-dir casa-matsim com.casa.cml.RunMatsim /working-dir/matsim/hermes_matsim_config_londinium.xml``