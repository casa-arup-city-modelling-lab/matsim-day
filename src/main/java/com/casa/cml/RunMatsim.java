package com.casa.cml;

import ch.sbb.matsim.mobsim.qsim.SBBTransitModule;
import ch.sbb.matsim.mobsim.qsim.pt.SBBTransitEngineQSimModule;
import ch.sbb.matsim.routing.pt.raptor.SwissRailRaptorModule;
import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;

public class RunMatsim {
    public static void main(String[] args) {

        //load config
        Config config = ConfigUtils.loadConfig(args[0]);

        //load config into scenario
        final Scenario scenario = ScenarioUtils.loadScenario(config);

        Controler controler = new Controler(scenario);

        // To use the fast pt router (Part 1 of 1)
        controler.addOverridingModule(new SwissRailRaptorModule());

        // To use the deterministic pt simulation (Part 1 of 2):
        controler.addOverridingModule(new SBBTransitModule());

        // To use the deterministic pt simulation (Part 2 of 2):
        controler.configureQSimComponents(components -> {
            new SBBTransitEngineQSimModule().configure(components);
        });

        controler.run();
    }
}