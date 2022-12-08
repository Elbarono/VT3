package by.romanovski.server.DataAccessLayer;

import by.romanovski.server.DataAccessLayer.BookDao.BookDao;
import by.romanovski.server.DataAccessLayer.UserDao.UserDao;


public class DaoFactory {
	
	/** UserDao entity */
	private static UserDao userDao = new UserDao();
	/** BookDao entity */
    private static BookDao bookDao = new BookDao();
    
    /**
     * Get UserDao
     * @return UserDao
     */
    public static UserDao getUserDao()
    {
    	return userDao;
    }
    
    /**
     * Get BookDao
     * @return BookDao
     */
    public static BookDao getBookDao()
    {
    	return bookDao;
    }
}
