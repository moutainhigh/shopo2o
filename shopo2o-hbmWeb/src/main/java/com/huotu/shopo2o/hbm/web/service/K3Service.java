package com.huotu.shopo2o.hbm.web.service;

/**
 * 金蝶相关接口
 * @author helloztt
 */
public interface K3Service {

    boolean getOrganizations(Long customerId,String erpId) throws Exception;

}
