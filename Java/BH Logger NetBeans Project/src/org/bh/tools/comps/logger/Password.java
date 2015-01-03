package org.bh.tools.comps.logger;

/**
 * Password, made for BH Logger, is copyright Blue Husky Programming ©2015 GPLv3 <hr/>
 * 
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0
 *		- 2015-01-02 (1.0.0) - Kyli created Password
 * @since 2015-01-02
 */
public class Password extends LogValue
{
	private char censor = '*';

	public void setCensor(char censor)
	{
		this.censor = censor;
	}

	public char getCensor()
	{
		return censor;
	}
	
	/**
	 * Use of this method is discouraged. This returns the character sequence value of this password, in plain text,
	 * uncensored, unencrypted, unhashed.
	 * 
	 * @return the character sequence value of this password, in plain text, uncensored, unencrypted, unhashed.
	 * 
	 * @deprecated Use of this method is discouraged. This returns the character sequence value of this password, in plain
	 * text, uncensored, unencrypted, unhashed.
	 */
	public CharSequence asCharSequence()
	{
		return val;
	}
	
	@Override
	public String toString()
	{
		char[] c = new char[length()];
		for (int i = 0, l = c.length; i < l; i++)
			c[i] = censor;
		return new String(c);
	}

	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 29 * hash + this.censor;
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		final Password other = (Password) obj;
		if (this.censor != other.censor) return false;
		return super.equals(obj);
	}
}
