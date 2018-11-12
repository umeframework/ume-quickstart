package org.umeframework.quickstart.app;

import org.umeframework.dora.tool.exp.db.Excel2DbExporter;

/**
 * 基于Excel输入的Table列表信息及数据库连接信息到处的表结构后，编辑数据，将编辑后的数据生成可更新至数据库的SQL。<br>
 * 
 * @author Yue MA
 */
public class ExpTableDataGenInsertSql {
	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			new Excel2DbExporter().expTableDataGenInsertSql("input/exp-table-data");
		} catch (Throwable e) {
			System.err.println(e);
		}
	}

}
