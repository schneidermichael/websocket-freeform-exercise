package at.schneidermichael.websocketmobileappdevelopment.model;

public class Data {
      private double p;
      private String s;
      private long t;
      private double v;

      public Data(double p, String s, long t, double v) {
            this.p = p;
            this.s = s;
            this.t = t;
            this.v = v;
      }

      @Override
      public String toString() {
            return "{" +
                    "\"p\":" + p +
                    ", \"s\":\"" + s + '\"' +
                    ", \"t\":" + t +
                    ", \"v\":" + v +
                    '}';
      }
}
