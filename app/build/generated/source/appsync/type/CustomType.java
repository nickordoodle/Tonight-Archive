package type;

import com.apollographql.apollo.api.ScalarType;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public enum CustomType implements ScalarType {
  ID {
    @Override
    public String typeName() {
      return "ID";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSDATE {
    @Override
    public String typeName() {
      return "AWSDate";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSTIME {
    @Override
    public String typeName() {
      return "AWSTime";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSDATETIME {
    @Override
    public String typeName() {
      return "AWSDateTime";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSTIMESTAMP {
    @Override
    public String typeName() {
      return "AWSTimestamp";
    }

    @Override
    public Class javaType() {
      return Long.class;
    }
  },

  AWSEMAIL {
    @Override
    public String typeName() {
      return "AWSEmail";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSJSON {
    @Override
    public String typeName() {
      return "AWSJSON";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSURL {
    @Override
    public String typeName() {
      return "AWSURL";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSPHONE {
    @Override
    public String typeName() {
      return "AWSPhone";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  },

  AWSIPADDRESS {
    @Override
    public String typeName() {
      return "AWSIPAddress";
    }

    @Override
    public Class javaType() {
      return String.class;
    }
  }
}
