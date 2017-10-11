package com.huotu.shopo2o.service.service.goods;

import com.huotu.shopo2o.common.utils.ApiResult;
import com.huotu.shopo2o.service.entity.good.HbmImage;
import com.huotu.shopo2o.service.entity.good.HbmSupplierGoods;
import com.huotu.shopo2o.service.entity.good.HbmSupplierProducts;
import com.huotu.shopo2o.service.enums.StoreGoodsStatusEnum;
import com.huotu.shopo2o.service.model.HbmSupplierGoodsSearcher;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by xyr on 2017/10/10.
 */
public interface HbmSupplierGoodsService {

    Page<HbmSupplierGoods> getGoodList(long storeId, HbmSupplierGoodsSearcher searcher);

    /**
     * 修改门店商品和货品审核状态
     * @param storeGoodsId
     * @param storeGoodsStatus
     * @param remark --备注
     * @return
     */
    ApiResult updateSupplierGoodsStatus(int storeGoodsId, StoreGoodsStatusEnum.CheckStatusEnum storeGoodsStatus, String remark) throws Exception;

    ApiResult updateGood(HbmSupplierGoods goods,List<HbmSupplierProducts> productsList,List<HbmImage> imgList,int status) throws Exception;

    /**
     * 设置商品状态为无效
     * @param storeGoodsId
     * @return
     * @throws Exception
     */
    ApiResult disableGood(int storeGoodsId) throws Exception;
}
