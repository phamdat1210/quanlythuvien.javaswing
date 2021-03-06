/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Bills;

/**
 *
 * @author admin
 */
public class BillsMapper implements RowMapper<Bills> {
    
    @Override
    public Bills mapRow(ResultSet rs) {
        Bills bills = new Bills();
        try {
            bills.setBillsId(rs.getInt("BillsID"));
//            bills.setReaderId(rs.getInt("ReaderID"));
            bills.setLibrarianName(rs.getNString("LibrarianName"));
            Date cdate = rs.getDate("CreatedDate");
            Date pdate = rs.getDate("PayDay");
            bills.setCreatedDate(cdate.toLocalDate());
            bills.setPayDay(pdate.toLocalDate());
            bills.setReaderName(rs.getNString("ReaderName"));
            bills.setGender(rs.getInt("Gender"));
            bills.setPhone(rs.getString("Phone"));
            bills.setAddress(rs.getNString("Address"));
            bills.setStatus(rs.getInt("status"));
            return bills;
        } catch (SQLException ex) {
            return null;
        }
        
    }
    
}
