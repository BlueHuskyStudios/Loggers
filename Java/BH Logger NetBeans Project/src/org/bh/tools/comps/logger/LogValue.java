package org.bh.tools.comps.logger;

import static bht.tools.util.Do.eq;
import static bht.tools.util.Do.s;
import java.util.Objects;

/**
 * LogValue, made for BH Logger, is copyright Blue Husky Programming ©2015 GPLv3 <hr/>
 * 
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0
		- 2015-01-02 (1.0.0) - Kyli created LogValue
 * @since 2015-01-02
 */
public class LogValue implements CharSequence
{
	protected String val;

	public LogValue(char... initValue)
	{
		val = new String(initValue);
	}

	public LogValue(CharSequence initValue)
	{
		val = s(initValue);
	}

	@Override
	public int length()
	{
		return val.length();
	}

	@Override
	public char charAt(int index)
	{
		return val.charAt(index);
	}

	@Override
	public CharSequence subSequence(int start, int end)
	{
		return val.subSequence(start, end);
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 71 * hash + Objects.hashCode(this.val);
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final LogValue other = (LogValue) obj;
		if (!eq(this.val, other.val)) return false;
		return true;
	}
}
