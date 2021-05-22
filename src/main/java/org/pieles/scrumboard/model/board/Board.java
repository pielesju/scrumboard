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
package org.pieles.scrumboard.model.board;

import java.util.ArrayList;
import org.pieles.scrumboard.model.projects.Project;
import org.pieles.scrumboard.model.projects.UserStory;

/**
 *
 * @author jpi
 */
public class Board {
    
    private ArrayList<UserStory> workflows = new ArrayList<UserStory>();
    
    private Project project;
    
    public Board(Project project) {
        this.project = project;
    }
        
    public void show() {
        System.out.printf("SCRUMBOARD FOR: " + project.getName() + "\n\n");
        System.out.printf("%18s |%18s |%18s |%18s\n", "BACKLOG", "TODO", "IN PROGRESS", "DONE");
        System.out.printf("-------------------|-------------------|-------------------|-------------------\n");
        for(int i = 0; i < workflows.size(); i++) {
            String backlog = "";
            String todo = "";
            String inprogress = "";
            String done = "";
            if(workflows.get(i).getWorkflow().isBacklog())
                backlog = workflows.get(i).toString();
            if(workflows.get(i).getWorkflow().isToDo())
                todo = workflows.get(i).toString();
            if(workflows.get(i).getWorkflow().isInProgress())
                inprogress = workflows.get(i).toString();
            if(workflows.get(i).getWorkflow().isDone())
                done = workflows.get(i).toString();
                
            System.out.printf("%18s |%18s |%18s |%18s\n", backlog, todo, inprogress, done);
        }
        System.out.printf("-------------------|-------------------|-------------------|-------------------\n");
    }
    
    public void addToBacklog(UserStory us) {
        workflows.add(us);
    }
}
