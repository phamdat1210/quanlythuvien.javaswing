/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IBillsDetailDAO;
import java.util.List;
import mapper.BillsDetailMapper;
import models.BillsDetail;

/**
 *
 * @author phamh
 */
public class BillsDetailDAO extends AbstractDAO<BillsDetail> implements IBillsDetailDAO{

    @Override
    public List<BillsDetail> getAll(int billId) {
        String sql = "{Call sp_getById_vw_BillsDetail(?)}";
        return query(sql, new BillsDetailMapper(), billId);
    }

    @Override
    public void save(BillsDetail billsDetail) {
        String sql = "{Call sp_insert_BillDetail(?,?,?)}";
        this.insert(sql, billsDetail.getBillId(),billsDetail.getBookId(),billsDetail.getQuantity());
    }

    @Override
    public void update(BillsDetail billsDetail) {
       String sql = "{Call sp_updateStatus_BillDetail(?,?,?)}";
       this.update(sql, billsDetail.getStatus(),billsDetail.getBillId(),billsDetail.getBookId());
    }

    @Override
    public void delete(BillsDetail billsDetail) {
      String sql = "{Call sp_delete_BillDetail(?)}";
      this.update(sql, billsDetail.getBillId());
    }
    
}
