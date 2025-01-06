//==========================================================
// File Name: Project.java
// Subject  : Class Project that represents project entity.
// Date     : Jan 1, 2025
// Author   : Alsayed A. Khaleel
//===========================================================

package model;
public class Project // class decalration.
{
    // instance variables.
    private int projectID;
    private String projectName;
    private String projectDescription;

    // no argument ctor.
    public Project() {}
    
    // ovlerloaded ctor.
    public Project(int projectID, String projectName)
    {
        setProjectID(projectID);
        setProjectName(projectName);
    }

    // projectID setter & getter.
    public int getProjectID() { return projectID; }
    public void setProjectID(int projectID) throws IllegalArgumentException
    {
        if(projectID <= 0)
            throw new IllegalArgumentException( "["+ getProjectID() + "] Invalid Project ID");

        this.projectID = projectID;
    }

    // projectName setter & getter.
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    // projectDescription mutttor & accessor.
    public String getProjectDescription() { return projectDescription; }
    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }   
}


