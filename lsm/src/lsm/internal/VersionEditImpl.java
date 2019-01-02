package lsm.internal;

import java.util.Map;
import java.util.TreeMap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import lsm.base.FileMetaData;
import lsm.base.InternalKey;

public class VersionEditImpl {
	/**
	 * key comparator名字  
	 */
	private String comparatorName; 
	/**
	 * 日志编号
	 */
	private Long logNumber;
	/**
	 * 下一个文件编号
	 */
	private Long nextFileNumber;
	/**
	 * 前一个日志编号,为了兼容老版本，新版本已弃用，一直为0
	 */
	private Long previousLogNumber;
	/**
	 * db中最大的seq（序列号），即最后一对kv事务操作的序列号
	 */
	private Long lastSequenceNumber;
	
	private final Map<Integer, InternalKey> compactPointers = new TreeMap<>();
	private final Multimap<Integer, FileMetaData> newFiles = ArrayListMultimap.create();
	private final Multimap<Integer, Long> deletedFiles = ArrayListMultimap.create();

}