package org.jspiders.movieApp.generators;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class generator implements IdentifierGenerator
{

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1)
			throws HibernateException 
	{
		return null;
	}
}
