package com.bupt.cad.datadic.common;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/08/16:24
 * @Description: 返回结果，状态码，信息，数据
 */

@Data
public class ReturnResult {
    public class RetResult {
        private Integer code;
        private String msg;
        private Object data;

        public RetResult() {
            this.code = Integer.valueOf(0);
            this.msg = "";
            this.data = null;
        }

        /**
         * 返回状态码、信息、以及数据
         */
        public RetResult(Integer code, String msg, Object data) {
            this.code = code;
            this.msg = "";
            this.data = data;
        }

        /**
         * 只返回状态码，以及信息可以用于失败时候来使用
         */
        public RetResult(Integer code, String msg) {
            this.code = code;
            this.msg = msg;
            this.data = null;
        }

        /**
         * 只返回状态码和数据
         */
        public RetResult(Integer code, Object data) {
            this.code = code;
            this.msg = "";
            this.data = data;
        }
    }
}
