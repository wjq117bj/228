package com.ljbd.tour.maldives.manager;
import com.ljbd.common.support.BaseManager;
import cn.org.rapid_framework.page.Page;
import com.ljbd.tour.maldives.model.TourExpansion;
import com.ljbd.tour.maldives.model.query.TourExpansionQuery;
import org.springframework.stereotype.Service;

@Service
public interface TourExpansionManager extends BaseManager<TourExpansion,java.lang.Integer> {

  public Page findPage(TourExpansionQuery query);
}
