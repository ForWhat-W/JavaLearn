package org.lhq;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lhq.leetcode.LeetCode;
import org.lhq.leetcode.struc.TreeNode;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


/**
 * @program: org.lhq.leetcode
 * @description: org.lhq.leetcode
 * @create: 2021-07-29 13:45
 */
@Slf4j
public class LeetCodeTest {

	LeetCode leetCode;
	@BeforeAll
	public static void before(){
		log.info("-------开始执行测试用例--------");
	}
	@AfterAll
	public static void after(){
		log.info("-------测试用例执行完成--------");
	}
	@BeforeEach
	public void beforeEach(){
		log.info("--------------测试对象实例化--------------");
		leetCode = new LeetCode();
	}
	@AfterEach
	public void afterEach(){
		log.info("----------------------------");
	}

	/**
	 * 整数反转
	 */
	@Test
	public void reverse(){
		int x = 1534236469;
		log.info(String.valueOf((1<<31)-1));
		log.info(String.valueOf(Integer.MAX_VALUE/10));
		log.info("------------------");
		log.info(String.valueOf(-1<<31));
		log.info(String.valueOf(Integer.MIN_VALUE/10));
		log.info(String.valueOf(x));
		log.info(String.valueOf(leetCode.reverse(x)));
	}

	/**
	 * 整数反转
	 */
	@Test
	public void isPalindrome(){
		log.info(String.valueOf(leetCode.isPalindrome(123)));
	}

	/**
	 * 罗马数字转阿拉伯数字
	 */
	@Test
	public void romanToInt(){
		log.info(leetCode.romanToInt("IVI").toString());
	}
	@Test
	public void longestCommonPrefix(){
		String[] strings = {"flower", "flow", "flight"};
		log.info(leetCode.longestCommonPrefix(strings));
	}
	@Test
	public void verticalTraversal(){
		TreeNode treeNode = new TreeNode(3);
		TreeNode treeNode1 = new TreeNode(9);
		TreeNode treeNode2 = new TreeNode(20);
		TreeNode treeNode3 = new TreeNode(15);
		TreeNode treeNode4 = new TreeNode(7);
		treeNode.left = treeNode1;
		treeNode.right = treeNode2;
		treeNode2.left = treeNode3;
		treeNode2.right = treeNode4;
		log.info(leetCode.verticalTraversal(treeNode).toString());
	}
	@Test
	public void removeElement(){
		int[] nums =new int[]{0,0,1,1,1,2,2,3,3,4};
		int i = leetCode.removeDuplicates(nums);
		int i1 = leetCode.removeElement(nums, 2);
		log.info(i+","+i1);
	}
	@Test
	public void aeiou(){
		log.info(leetCode.reverseVowels("Hello"));
	}
	@Test
	public void kWeakestRows(){
		int[][] array = {
				{1,1,1,1,1},
				{1,1,1,0,0},
				{1,1,1,1,0},
				{1,0,0,0,0},
				{0,0,0,0,0},
				{1,1,1,1,0},
		};
		log.info(Arrays.toString(leetCode.kWeakestRows(array, 3)));
	}
	@Test
	public void lengthOfLongestSubstring(){
		String s = "abcabcbb";
		log.info(String.valueOf(leetCode.lengthOfLongestSubstring(s)));
	}
	@Test
	public void catBunana(){
		int[] banana1 = {3,6,7,11};
		int[] banana2 = {30,11,23,4,20};
		int[] banana3 = {30,11,23,4,20};
		int[] banana4 = {312884470};
		int h1 = 8;
		int h2 = 5;
		int h3 = 6;
		int h4 = 312884469;
		int result = leetCode.minEatingSpeed(banana1, h1);
		int result2 = leetCode.minEatingSpeed(banana2, h2);
		int result3 = leetCode.minEatingSpeed(banana3, h3);
		int result4 = leetCode.minEatingSpeed(banana4, h4);
		log.info(String.valueOf(result));
		log.info(String.valueOf(result2));
		log.info(String.valueOf(result3));
		log.info(String.valueOf(result4));
	}
	@Test
	public void plusOne(){
		int[] one = {3,6,7,9};
		int[] ints = leetCode.plusOne(one);
		Arrays.stream(ints).boxed().forEach(integer -> log.info(integer.toString()));
	}
	@Test
	public void nanning(){
		Calendar instance = Calendar.getInstance();
		instance.set(2021,5,25);
		Date time = instance.getTime();
		long between = DateUtil.between(time, new Date(), DateUnit.DAY);
		log.trace("我离开南宁的{}天",between);
		log.debug("我离开南宁的{}天",between);
		log.info("我离开南宁的{}天",between);
		log.warn("我离开南宁的{}天",between);
		log.error("我离开南宁的{}天",between);
	}

}
