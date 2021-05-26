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

import javax.xml.bind.JAXBException;

/**
 * class which is started by start of this application.
 * @author jpi
 */
public class Launcher {
    
    public static void main(String[] args) throws JAXBException {
        System.out.printf("  %s", "SCRUM BOARD\n");
        System.out.printf("  %s", "pieles.org\n");
        System.out.printf("  %s", "version 1.0\n");
        System.out.printf("-------------------------------------------------------------------------------\n\n");
       
        Controller.mainMenu();
    }
    
}
