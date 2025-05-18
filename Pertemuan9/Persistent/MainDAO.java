/*
* Nama File    : MainDAO.java
* Deskripsi    : file MainDAO
* Pembuat      : Siriel Wafa Nuriel Fahri
* Tanggal      : 16 Mei 2025
*/


package Pertemuan9.Persistent;

public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Fahri");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
