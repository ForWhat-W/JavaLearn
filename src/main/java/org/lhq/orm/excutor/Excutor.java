package org.lhq.orm.excutor;

public interface Excutor {
	public <T> T query(String statement,Object parameter);

}
