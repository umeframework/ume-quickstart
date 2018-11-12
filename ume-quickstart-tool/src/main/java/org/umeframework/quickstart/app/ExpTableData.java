package org.umeframework.quickstart.app;

import org.umeframework.dora.tool.exp.db.Excel2DbExporter;

/**
 * 1.根据Excel输入的Table列表信息及数据库连接信息，查询数据字典获取表定义的结构，以此结构创建Excel的页并导出数据库中的既存数据至Excel文件。 <br>
 * 
 * @author Yue MA
 */
public class ExpTableData {

	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			new Excel2DbExporter().expTableData("input/exp-table-data");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
