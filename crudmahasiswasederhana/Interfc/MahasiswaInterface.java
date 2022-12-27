/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package latihanpbo.crudmahasiswasederhana.Interfc;

import java.sql.SQLException;
import java.util.List;
import latihanpbo.crudmahasiswasederhana.db.models.Mahasiswa;

/**
 *
 * @author HP
 * Nabilla Pramudya Wardhani
 * 21103018
 */
public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update(Mahasiswa o) throws SQLException;
    void delete(String nim) throws SQLException;

    List<Mahasiswa> getAll() throws SQLException;

}


