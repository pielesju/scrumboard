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

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author jpi
 */
public class Component {
    private ArrayList<Epic> epics = new ArrayList<Epic>();
    @XmlAttribute
    private String name;
    
    public Component(String name) {
        this.name = name;
    }
    @XmlElement(name ="epic")
    public ArrayList<Epic> getEpics() {
        return epics;
    }
    
    public void addEpic(Epic epic) {
        this.epics.add(epic);
    }
    
    public void removeEpic(Epic epic) {
        this.epics.remove(epic);
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
