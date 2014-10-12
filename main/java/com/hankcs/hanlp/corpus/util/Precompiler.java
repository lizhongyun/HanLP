/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/9/18 20:21</create-date>
 *
 * <copyright file="Precompiler.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.hanlp.corpus.util;

import com.hankcs.hanlp.corpus.document.sentence.word.Word;
import com.hankcs.hanlp.utility.Predefine;
import com.hankcs.hanlp.utility.Utility;

/**
 * 预编译与反编译一些词语
 *
 * @author hankcs
 */
public class Precompiler
{
    /**
     * 将一个单词编译为等效字串
     *
     * @param word
     * @return
     */
    public static Word compile(Word word)
    {
        switch (word.label)
        {
            case "ns":
            case "nsf":
            {
                word.value = Predefine.TAG_PLACE;
            }
            break;
//            case "nz":
            case "nx":
            {
                    word.value = Predefine.TAG_PROPER;
            }
            break;
            case "nt":
            case "ntc":
            case "ntcf":
            case "ntcb":
            case "ntch":
            case "nto":
            case "ntu":
            case "nts":
            case "nth":
            {
                word.value = Predefine.TAG_GROUP;
            }
            break;
            case "m":
            case "mq":
            {
                    word.value = Predefine.TAG_NUMBER;
            }
            break;
            case "x":
            {
                word.value = Predefine.TAG_CLUSTER;
            }
            break;
            case "xx":
            {
                word.value = Predefine.TAG_OTHER;
            }
            break;
            case "t":
            {
                    word.value = Predefine.TAG_TIME;
            }
            break;
            case "nr":
            {
                word.value = Predefine.TAG_PEOPLE;
            }
            break;
        }
        return word;
    }
}