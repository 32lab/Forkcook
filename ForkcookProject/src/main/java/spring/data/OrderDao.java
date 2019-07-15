package spring.data;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao extends SqlSessionDaoSupport{
	public int getTotalCount(){
		return getSqlSession().selectOne("order.orderTotalCount");
	}
	
	public List<OrderDto> getList(){
		return getSqlSession().selectList("order.orderList");
	}
	
	public OrderDto getListData(String ordernum){
		return getSqlSession().selectOne("order.orderListData", ordernum);
	}
	
	public List<OrderDto> getMenuData(String ordernum){
		return getSqlSession().selectList("order.orderMenuData", ordernum);
	}
	
	public void orderDelete(String ordernum){
		getSqlSession().delete("order.orderDelete",ordernum);
	}
	
}
