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

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.JAXBException;
import org.pieles.scrumboard.model.projects.Component;
import org.pieles.scrumboard.model.projects.Epic;
import org.pieles.scrumboard.model.projects.Project;
import org.pieles.scrumboard.model.projects.UseCase;
import org.pieles.scrumboard.model.projects.UserStory;

/**
 *
 * @author jpi
 */
public class Controller {

    public static void mainMenu() throws JAXBException {
        Scanner scanner = new Scanner(System.in);
        printList("show projects", "save and quit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                projectMenu();
            case 2:
                break;
            default:
                break;
        }
    }

    private static void printSplitter() {
        System.out.println("-------------------------------------------------------------------------------");
    }

    private static void projectMenu() throws JAXBException {
        ArrayList<Project> projects = Data.getProjects();
        for (int i = 0; i < projects.size(); i++) {
            System.out.println((i + 1) + ". " + projects.get(i).getName());
        }
        printSplitter();
        printList("add project", "remove project", "edit project");
    }

    private static void printList(String... items) {
        int count = 1;
        for (String item : items) {
            System.out.printf(count + ". " + item + "\n");
            count++;
        }
    }

    public static void showProjects() throws JAXBException {
        ArrayList<Project> projects = Data.getProjects();

        for (Project pj : projects) {
            System.out.println(pj);
            for (Component com : pj.getComponents()) {
                System.out.println("    " + com);
                for (Epic ep : com.getEpics()) {
                    System.out.println("        " + ep);
                    for (UseCase uc : ep.getUseCases()) {
                        System.out.println("            " + uc);
                        for (UserStory us : uc.getUserStories()) {
                            System.out.println("                " + us);
                        }
                    }
                }
            }
        }
    }

}
