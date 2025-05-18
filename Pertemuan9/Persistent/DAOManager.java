/*
* Nama File    : DAOManager.java
* Deskripsi    : file DAOManager
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 16 Mei 2025
*/


package Pertemuan9.Persistent;

public class DAOManager {
    private PersonDAO personDAO;

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

}
