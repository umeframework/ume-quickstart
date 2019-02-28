package org.umeframework.quickstart.app;

import org.umeframework.dora.tool.gen.ServiceGenerator;
import org.umeframework.dora.tool.poi.TypeMapper;

/**
 * 读取并解析指定的输入目录下的Service设计文档，生成如下的源码：<br>
 * <li> Service DTO (对应Service输入输出的JavaBean定义)
 * <li> Service 接口声明
 *
 * @author Yue MA
 */
public class CreateServiceInterface {

	/**
	 * 主函数.<br>
	 * 允许方法：Eclipse中右键点击该类，选择[Run As] - [Java Application]选项执行.<br>
	 */
	public static void main(String[] args) {
		try {
			String inputPath = "input/design-service";
			new ServiceGenerator(new TypeMapper()).execute(inputPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
