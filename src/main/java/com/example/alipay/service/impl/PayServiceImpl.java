package com.example.alipay.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.example.alipay.service.PayService;
import org.springframework.stereotype.Service;

@Service
public class PayServiceImpl implements PayService {

    @Override
    public String pay(){
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do",
                "2021000119644257",
                "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCWlCeyrZxjPmeX8NB2N7OL2cW50IphrEyX/wX0GR6q/d2Hx8zgAFpHqGXtQMO8Z5vOlLQnlvZLZkZiTnElRen1jqfxmfGlUjKZNwv5wBKrNE3vNIN9fvk6MmYxhsukQCyHcpbX8sAgsPu37N5lWUwDpLxuBN81iQPzoYjxwV/XMDxBREbTwfUkz7fc9vmCMi2EwmTs0E1k8lVzOQwj5MTXDj0Gm/wiVo4CjScMy0vMuIsasMCA1dm9+068Z2x4j9A1UvWKeZ0efEU29il76w/UBjjFAM5rqQBJjMR+2m6K+cyzftW/M2khkDZodeMlkRD0g1JUwU2k9Kzlx6By1j8pAgMBAAECggEABLgj/l+elSWxjXuIrQvV3r42ijpU+/awd9sQTrQy190ZAlZqv2KDcdd/Sk5LVC5THchfVRZQJdDQx+f5d9eXG5EbBmFyx2GqIE8vWuaAL0l2X9bfgCFookBOH6M/4qf4PU6EF8SN7PhfC0arObXwwfR5y2DvtffTXeFkL1+GJ3JZL3xOVtg/vDLjHOwkHer3j42c9X87x70wUVWgXTcyj5xlDYz9IX9y75ozz1MZwtq8KPssuLbPc2KqiPonmoKamus5zU8yG4MwQISvvyUE9jw8nfFHbCN82qzem/aW7kQnbhX5zUnwWvN3xkSc0MtQMHn7JNC3pcepPm/sC33pYQKBgQDbIbPb9A4mSRSQnxJMj+GZlYQHB3O8Um94V5mzSUOR6dLpqKoXyM4DhW3HnqSLFrDHMVBm1P5t3Gm6sOPHHWYwRulz9OuCaTvWjM+m401f4zRNWzxd4l+4VzKztZAMmdINpR+rq4wu4SdRkhilPSxe25QPgsm5EtRwGgAHpruT3QKBgQCv6ckGBoPgQFvEzdCavhURQJvHcqxsTvaEjUvhGYAS614kAzScf9lAE0pSB1a5/IMHACSQBqJOcWH6Sj6GnPGmOPcAZVJaLvupxzKw+zs2Y9VNmmNNtgqXMbNkr7czuG+S588Zt3SrjvOljkbr+NQ+9gP/awk4hz6FUj1w/LeZvQKBgEOUAja77j0qXng3RlpsKOPHc18DklKqjYvsYA8lcfwmww+iH0qUd8woMvHT3+SxC7VyZNxBpXFV/xk/Ag/e5ivPQqGrD5I5R+XjqQpLoQoINJICp/xAGsrrwUwgmxr3uQrSOJElp2axswF577XNxsg+KUwbRoCX6QHlUssJRWHVAoGAAadI5G2bP7hbJHZqx4mR2R+qVy2UwU/csVJCrFL5CTR9JgmBrRbmi9uijzLSdd0RvjcaIOBvFh2qtheMjudavh069R3+sCpQ4z+kElXKMLCviJMy68ASSWmGLiQYrLvHELJtF+jJh/NIBv5XXFBybkURtIzlAUsEI2yqdy1o7GECgYA4l8OSVXtTui76h2+Goi5q9j3IW1LYuAT8zgvRmlZA4ABufSxk7LIpzwUlvGnymFERudUCtLIpouTTzPPuzet/85POGCpl0AtKL1WtKIOYX1NuyCGdLHwPkRbcP35esssZVdVDR5mVvncQReuvMM2vXCYTt7gEIxZB6PrNdVs6gg==",
                "json",
                "utf-8",
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlpQnsq2cYz5nl/DQdjezi9nFudCKYaxMl/8F9Bkeqv3dh8fM4ABaR6hl7UDDvGebzpS0J5b2S2ZGYk5xJUXp9Y6n8ZnxpVIymTcL+cASqzRN7zSDfX75OjJmMYbLpEAsh3KW1/LAILD7t+zeZVlMA6S8bgTfNYkD86GI8cFf1zA8QURG08H1JM+33Pb5gjIthMJk7NBNZPJVczkMI+TE1w49Bpv8IlaOAo0nDMtLzLiLGrDAgNXZvftOvGdseI/QNVL1inmdHnxFNvYpe+sP1AY4xQDOa6kASYzEftpuivnMs37VvzNpIZA2aHXjJZEQ9INSVMFNpPSs5cegctY/KQIDAQAB",
                "RSA2");
        AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
        request.setNotifyUrl("http://localhost:8080/notify");
        request.setReturnUrl("http://localhost:8080/return");

        JSONObject bizContent = new JSONObject();
        bizContent.put("out_trade_no", "20150320010101001");
        bizContent.put("total_amount", 88.88);
        bizContent.put("subject", "测试商品");
        bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");
        System.out.println(bizContent.toString());

        request.setBizContent(bizContent.toString());
        AlipayTradePagePayResponse response = null;
        try {
            response = alipayClient.pageExecute(request);
            System.out.println("TradeNo: " + response.getTradeNo());
            return response.getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return null;
        }
    }

}
