package com.dasannetworks.tms.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BookLocalService
 * @generated
 */
public class BookLocalServiceWrapper implements BookLocalService,
    ServiceWrapper<BookLocalService> {
    private BookLocalService _bookLocalService;

    public BookLocalServiceWrapper(BookLocalService bookLocalService) {
        _bookLocalService = bookLocalService;
    }

    /**
    * Adds the book to the database. Also notifies the appropriate model listeners.
    *
    * @param book the book
    * @return the book that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book addBook(
        com.dasannetworks.tms.sb.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.addBook(book);
    }

    /**
    * Creates a new book with the primary key. Does not add the book to the database.
    *
    * @param bookId the primary key for the new book
    * @return the new book
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book createBook(long bookId) {
        return _bookLocalService.createBook(bookId);
    }

    /**
    * Deletes the book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookId the primary key of the book
    * @return the book that was removed
    * @throws PortalException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book deleteBook(long bookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.deleteBook(bookId);
    }

    /**
    * Deletes the book from the database. Also notifies the appropriate model listeners.
    *
    * @param book the book
    * @return the book that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book deleteBook(
        com.dasannetworks.tms.sb.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.deleteBook(book);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bookLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.tms.sb.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.tms.sb.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.dasannetworks.tms.sb.model.Book fetchBook(long bookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.fetchBook(bookId);
    }

    /**
    * Returns the book with the primary key.
    *
    * @param bookId the primary key of the book
    * @return the book
    * @throws PortalException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book getBook(long bookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.getBook(bookId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.dasannetworks.tms.sb.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of books
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.dasannetworks.tms.sb.model.Book> getBooks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.getBooks(start, end);
    }

    /**
    * Returns the number of books.
    *
    * @return the number of books
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBooksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.getBooksCount();
    }

    /**
    * Updates the book in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param book the book
    * @return the book that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.dasannetworks.tms.sb.model.Book updateBook(
        com.dasannetworks.tms.sb.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.updateBook(book);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bookLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bookLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bookLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.dasannetworks.tms.sb.model.Book addCustomBook(
        com.dasannetworks.tms.sb.model.Book book,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.addCustomBook(book, serviceContext);
    }

    @Override
    public void deleteCustomBook(long bookId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _bookLocalService.deleteCustomBook(bookId);
    }

    @Override
    public com.dasannetworks.tms.sb.model.Book updateCustomBook(
        com.dasannetworks.tms.sb.model.Book book,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookLocalService.updateCustomBook(book, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BookLocalService getWrappedBookLocalService() {
        return _bookLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBookLocalService(BookLocalService bookLocalService) {
        _bookLocalService = bookLocalService;
    }

    @Override
    public BookLocalService getWrappedService() {
        return _bookLocalService;
    }

    @Override
    public void setWrappedService(BookLocalService bookLocalService) {
        _bookLocalService = bookLocalService;
    }
}