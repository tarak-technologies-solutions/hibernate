package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentityGenerator;

public class ICICIAccGenerator extends IdentityGenerator 
{
	@Override
	public Serializable generate(SessionImplementor s, Object obj) {
		String name="ICICI";

		try{

/*SQL> create sequence icicigenerator
  2  start with 1234
  3  increment by 1
  4  nocycle
  5  nocache;*/
	Connection con=s.connection();
	
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select icicigenerator.nextval from dual");
	if(rs.next())
	{
		name=name+rs.getInt(1);
	}
		
	}catch(Exception e){}
	return name;
	}
	

}
