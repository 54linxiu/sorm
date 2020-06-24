package test;

import java.util.List;

import com.qht.po.Emp;
import com.qht.sorm.core.Query;
import com.qht.sorm.core.QueryFactory;
import com.qht.vo.Empvo;



public class Test {
	public static void add() {
		Emp e = new Emp();
		e.setEmpname("经中国");
		e.setSalay(123d);
		e.setHireDate(new java.sql.Date(System.currentTimeMillis()));
		Query q = QueryFactory.createQuery();
		q.insert(e);
	}
	
	public static void delete() {
		Emp e = new Emp();
		e.setEmpname("经中国");
		e.setSalay(123d);
		e.setId(136);
		Query q = QueryFactory.createQuery();
		q.delete(e);
	}
	
	public static void select01() {
		Query q = QueryFactory.createQuery();
		Number b=  q.queryNumber("select count(*) from emp where salay>?", new Object[] {1000});
		System.out.println(b);
	}
	
	public static void select0() {
		Query q = QueryFactory.createQuery();
		Emp e =  (Emp) q.queryUniqueRow("select * from emp where id = ?", Emp.class, new Object[] {102});
		System.out.println(e.getEmpname()+"  "+e.getSalay());
	}
	public static void select3() {
		Query q = QueryFactory.createQuery();
		List<Emp> e =  (List) q.queryRows("select * from emp where id > ?", Emp.class, new Object[] {99});
		for (Emp emp : e) {
			System.out.println(emp.getEmpname()+"   "+emp.getSalay());
		}
	}
	public static void select4() {
		Query q = QueryFactory.createQuery();
		String sql = "select e.id,e.empname,e.salay,b.buid 'bmid',b.dz 'addr' from emp e join bumen b on e.bmid=b.buid";
		List<Empvo> e =  (List) q.queryRows(sql, Empvo.class, null);
		for (Empvo emp : e) {
			System.out.println(emp.getEmpname()+"   "+emp.getSalay()+"  "+emp.getAddr());
		}
	}
	
	public static void select5() {
		Query q = QueryFactory.createQuery();
		Emp e = (Emp) q.queryById(Emp.class, 100);
		System.out.println(e.getEmpname());
	}
	
	
	public static void update() {
		Emp e = new Emp();
		e.setEmpname("西野七濑");
		e.setSalay(999d);
		e.setId(100);
		Query q = QueryFactory.createQuery();
		q.update(e, new String[] {"empname","salay"});
	}
	
	
	
	public static void main(String[] args) {
		select5();
	}
}
