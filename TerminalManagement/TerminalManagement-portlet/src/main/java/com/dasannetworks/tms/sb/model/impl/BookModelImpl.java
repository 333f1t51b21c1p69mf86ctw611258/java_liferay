package com.dasannetworks.tms.sb.model.impl;

import com.dasannetworks.tms.sb.model.Book;
import com.dasannetworks.tms.sb.model.BookModel;
import com.dasannetworks.tms.sb.model.BookSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Book service. Represents a row in the &quot;tms_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.dasannetworks.tms.sb.model.BookModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BookImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BookImpl
 * @see com.dasannetworks.tms.sb.model.Book
 * @see com.dasannetworks.tms.sb.model.BookModel
 * @generated
 */
@JSON(strict = true)
public class BookModelImpl extends BaseModelImpl<Book> implements BookModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a book model instance should use the {@link com.dasannetworks.tms.sb.model.Book} interface instead.
     */
    public static final String TABLE_NAME = "tms_Book";
    public static final Object[][] TABLE_COLUMNS = {
            { "bookId", Types.BIGINT },
            { "bookName", Types.VARCHAR },
            { "description", Types.VARCHAR },
            { "authorName", Types.VARCHAR },
            { "isbn", Types.INTEGER },
            { "price", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table tms_Book (bookId LONG not null primary key,bookName VARCHAR(75) null,description VARCHAR(75) null,authorName VARCHAR(75) null,isbn INTEGER,price INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table tms_Book";
    public static final String ORDER_BY_JPQL = " ORDER BY book.bookId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY tms_Book.bookId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.dasannetworks.tms.sb.model.Book"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.dasannetworks.tms.sb.model.Book"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.dasannetworks.tms.sb.model.Book"));
    private static ClassLoader _classLoader = Book.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Book.class };
    private long _bookId;
    private String _bookName;
    private String _description;
    private String _authorName;
    private int _isbn;
    private int _price;
    private Book _escapedModel;

    public BookModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Book toModel(BookSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Book model = new BookImpl();

        model.setBookId(soapModel.getBookId());
        model.setBookName(soapModel.getBookName());
        model.setDescription(soapModel.getDescription());
        model.setAuthorName(soapModel.getAuthorName());
        model.setIsbn(soapModel.getIsbn());
        model.setPrice(soapModel.getPrice());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Book> toModels(BookSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Book> models = new ArrayList<Book>(soapModels.length);

        for (BookSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _bookId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBookId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bookId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Book.class;
    }

    @Override
    public String getModelClassName() {
        return Book.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bookId", getBookId());
        attributes.put("bookName", getBookName());
        attributes.put("description", getDescription());
        attributes.put("authorName", getAuthorName());
        attributes.put("isbn", getIsbn());
        attributes.put("price", getPrice());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bookId = (Long) attributes.get("bookId");

        if (bookId != null) {
            setBookId(bookId);
        }

        String bookName = (String) attributes.get("bookName");

        if (bookName != null) {
            setBookName(bookName);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        String authorName = (String) attributes.get("authorName");

        if (authorName != null) {
            setAuthorName(authorName);
        }

        Integer isbn = (Integer) attributes.get("isbn");

        if (isbn != null) {
            setIsbn(isbn);
        }

        Integer price = (Integer) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }
    }

    @JSON
    @Override
    public long getBookId() {
        return _bookId;
    }

    @Override
    public void setBookId(long bookId) {
        _bookId = bookId;
    }

    @JSON
    @Override
    public String getBookName() {
        if (_bookName == null) {
            return StringPool.BLANK;
        } else {
            return _bookName;
        }
    }

    @Override
    public void setBookName(String bookName) {
        _bookName = bookName;
    }

    @JSON
    @Override
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    @Override
    public void setDescription(String description) {
        _description = description;
    }

    @JSON
    @Override
    public String getAuthorName() {
        if (_authorName == null) {
            return StringPool.BLANK;
        } else {
            return _authorName;
        }
    }

    @Override
    public void setAuthorName(String authorName) {
        _authorName = authorName;
    }

    @JSON
    @Override
    public int getIsbn() {
        return _isbn;
    }

    @Override
    public void setIsbn(int isbn) {
        _isbn = isbn;
    }

    @JSON
    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public void setPrice(int price) {
        _price = price;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Book.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Book toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Book) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BookImpl bookImpl = new BookImpl();

        bookImpl.setBookId(getBookId());
        bookImpl.setBookName(getBookName());
        bookImpl.setDescription(getDescription());
        bookImpl.setAuthorName(getAuthorName());
        bookImpl.setIsbn(getIsbn());
        bookImpl.setPrice(getPrice());

        bookImpl.resetOriginalValues();

        return bookImpl;
    }

    @Override
    public int compareTo(Book book) {
        long primaryKey = book.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        long primaryKey = book.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Book> toCacheModel() {
        BookCacheModel bookCacheModel = new BookCacheModel();

        bookCacheModel.bookId = getBookId();

        bookCacheModel.bookName = getBookName();

        String bookName = bookCacheModel.bookName;

        if ((bookName != null) && (bookName.length() == 0)) {
            bookCacheModel.bookName = null;
        }

        bookCacheModel.description = getDescription();

        String description = bookCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            bookCacheModel.description = null;
        }

        bookCacheModel.authorName = getAuthorName();

        String authorName = bookCacheModel.authorName;

        if ((authorName != null) && (authorName.length() == 0)) {
            bookCacheModel.authorName = null;
        }

        bookCacheModel.isbn = getIsbn();

        bookCacheModel.price = getPrice();

        return bookCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{bookId=");
        sb.append(getBookId());
        sb.append(", bookName=");
        sb.append(getBookName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", authorName=");
        sb.append(getAuthorName());
        sb.append(", isbn=");
        sb.append(getIsbn());
        sb.append(", price=");
        sb.append(getPrice());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.dasannetworks.tms.sb.model.Book");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bookId</column-name><column-value><![CDATA[");
        sb.append(getBookId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bookName</column-name><column-value><![CDATA[");
        sb.append(getBookName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>authorName</column-name><column-value><![CDATA[");
        sb.append(getAuthorName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>isbn</column-name><column-value><![CDATA[");
        sb.append(getIsbn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>price</column-name><column-value><![CDATA[");
        sb.append(getPrice());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
