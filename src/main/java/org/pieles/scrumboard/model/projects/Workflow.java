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
package org.pieles.scrumboard.model.projects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author jpi
 */

public class Workflow {
    
    @XmlAttribute
    private boolean backlog = false;
    @XmlAttribute
    private boolean toDo = false;
    @XmlAttribute
    private boolean inProgress = false;
    @XmlAttribute
    private boolean done = false;
    
    public Workflow() {
        
    }
    
    public void addToBacklog() {
        this.backlog = true;
    }
    
    public void removeFromBacklog() {
        this.backlog = false;
    }
    
    public void setToDo() {
        this.backlog = false;
        this.toDo = true;
    }
    
    public void setInProgress() {
        this.toDo = false;
        this.inProgress = true;
    }
    
    public void setDone() {
        this.inProgress = false;
        this.done = true;
    }

    /**
     * @return the backlog
     */
    public boolean isBacklog() {
        return backlog;
    }

    /**
     * @return the toDo
     */
    public boolean isToDo() {
        return toDo;
    }

    /**
     * @return the inProgress
     */
    public boolean isInProgress() {
        return inProgress;
    }

    /**
     * @return the done
     */
    public boolean isDone() {
        return done;
    }
    
    
   
}
