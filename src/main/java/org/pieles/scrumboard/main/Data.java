/*
 * Copyright (C) 2021 jpi
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.pieles.scrumboard.main;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.pieles.scrumboard.model.board.Board;
import org.pieles.scrumboard.model.projects.Component;
import org.pieles.scrumboard.model.projects.Epic;
import org.pieles.scrumboard.model.projects.Project;
import org.pieles.scrumboard.model.projects.Projects;
import org.pieles.scrumboard.model.projects.UseCase;
import org.pieles.scrumboard.model.projects.UserStory;

/**
 *
 * @author jpi
 */
public class Data {
    
    private static ArrayList<Project> projects = new ArrayList<Project>();
    
    
    
    public static ArrayList<Project> getProjects() throws JAXBException {
        Project proj1 = new Project("Projekt1");
        Component com1 = new Component("Component1");
        proj1.addComponent(com1);
        Epic ep1 = new Epic("Epic1");
        UseCase uc1 = new UseCase("uc1");
        UserStory us1 = new UserStory("us1");
        uc1.addUserStory(us1);
        UserStory us2 = new UserStory("us2");
        uc1.addUserStory(us2);
        UserStory us3 = new UserStory("us3");
        uc1.addUserStory(us3);
        ep1.addUseCase(uc1);
        UseCase uc2 = new UseCase("uc2");
        ep1.addUseCase(uc1);
        UseCase uc3 = new UseCase("uc3");
        UserStory us4 = new UserStory("us4");
        uc2.addUserStory(us4);
        UserStory us5 = new UserStory("us5");
        uc2.addUserStory(us5);
        UserStory us6 = new UserStory("us6");
        uc2.addUserStory(us6);
        ep1.addUseCase(uc1);
        com1.addEpic(ep1);
        
        
        Epic ep2 = new Epic("Epic2");
        com1.addEpic(ep2);
        Epic ep3 = new Epic("Epic3");
        com1.addEpic(ep3);
        Epic ep4 = new Epic("Epic4");
        com1.addEpic(ep4);
        Epic ep5 = new Epic("Epic5");
        com1.addEpic(ep5);
        
        Component com2 = new Component("Component2");
        proj1.addComponent(com2);
        Component com3 = new Component("Component3");
        proj1.addComponent(com3);
        Component com4 = new Component("Component4");
        proj1.addComponent(com4);
        Component com5 = new Component("Component5");
        proj1.addComponent(com5);
        Component com6 = new Component("Component6");
        proj1.addComponent(com6);
        
        
        Project proj2 = new Project("Projekt2");
        
        
        Project proj3 = new Project("Projekt3");
        
        
        Project proj4 = new Project("Projekt4");
        Component com7 = new Component("Component7");
        proj4.addComponent(com7);
        
        
        Project proj5 = new Project("Projektawdawf5");
        Component com8 = new Component("Component8");
        proj5.addComponent(com8);
        
        
        Project proj6 = new Project("Projekt6");
        
        Projects pjs = new Projects();
        pjs.add(proj1);
        pjs.add(proj2);
        pjs.add(proj3);
        pjs.add(proj4);
        pjs.add(proj5);
        JAXBContext context = JAXBContext.newInstance(Projects.class);
        //Marshaller m = context.createMarshaller();
        //m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //m.marshal(pjs, System.out);
        File file = new File("/home/jpi/projects.xml");
        JAXB.marshal(pjs, file);
        
        projects.add(proj1);
        projects.add(proj2);
        projects.add(proj3);
        projects.add(proj4);
        projects.add(proj5);
        projects.add(proj6);
        
        Board b = new Board(proj1);

        b.addToBacklog(us1);
        b.addToBacklog(us2);
        b.addToBacklog(us3);
        b.addToBacklog(us4);
        b.addToBacklog(us5);
        b.addToBacklog(us6);
        
        us1.getWorkflow().addToBacklog();
        us2.getWorkflow().addToBacklog();
        us3.getWorkflow().addToBacklog();
        us4.getWorkflow().setToDo();
        us5.getWorkflow().setInProgress();
        
        us6.getWorkflow().setDone();
        b.show();
        
        return Data.projects;
    }
    
}
