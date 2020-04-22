package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class ModelIDFilterInput implements InputType {
  private final Input<String> ne;

  private final Input<String> eq;

  private final Input<String> le;

  private final Input<String> lt;

  private final Input<String> ge;

  private final Input<String> gt;

  private final Input<String> contains;

  private final Input<String> notContains;

  private final Input<List<String>> between;

  private final Input<String> beginsWith;

  ModelIDFilterInput(Input<String> ne, Input<String> eq, Input<String> le, Input<String> lt,
      Input<String> ge, Input<String> gt, Input<String> contains, Input<String> notContains,
      Input<List<String>> between, Input<String> beginsWith) {
    this.ne = ne;
    this.eq = eq;
    this.le = le;
    this.lt = lt;
    this.ge = ge;
    this.gt = gt;
    this.contains = contains;
    this.notContains = notContains;
    this.between = between;
    this.beginsWith = beginsWith;
  }

  public @Nullable String ne() {
    return this.ne.value;
  }

  public @Nullable String eq() {
    return this.eq.value;
  }

  public @Nullable String le() {
    return this.le.value;
  }

  public @Nullable String lt() {
    return this.lt.value;
  }

  public @Nullable String ge() {
    return this.ge.value;
  }

  public @Nullable String gt() {
    return this.gt.value;
  }

  public @Nullable String contains() {
    return this.contains.value;
  }

  public @Nullable String notContains() {
    return this.notContains.value;
  }

  public @Nullable List<String> between() {
    return this.between.value;
  }

  public @Nullable String beginsWith() {
    return this.beginsWith.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (ne.defined) {
          writer.writeString("ne", ne.value);
        }
        if (eq.defined) {
          writer.writeString("eq", eq.value);
        }
        if (le.defined) {
          writer.writeString("le", le.value);
        }
        if (lt.defined) {
          writer.writeString("lt", lt.value);
        }
        if (ge.defined) {
          writer.writeString("ge", ge.value);
        }
        if (gt.defined) {
          writer.writeString("gt", gt.value);
        }
        if (contains.defined) {
          writer.writeString("contains", contains.value);
        }
        if (notContains.defined) {
          writer.writeString("notContains", notContains.value);
        }
        if (between.defined) {
          writer.writeList("between", between.value != null ? new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (String $item : between.value) {
                listItemWriter.writeCustom(CustomType.ID, $item);
              }
            }
          } : null);
        }
        if (beginsWith.defined) {
          writer.writeString("beginsWith", beginsWith.value);
        }
      }
    };
  }

  public static final class Builder {
    private Input<String> ne = Input.absent();

    private Input<String> eq = Input.absent();

    private Input<String> le = Input.absent();

    private Input<String> lt = Input.absent();

    private Input<String> ge = Input.absent();

    private Input<String> gt = Input.absent();

    private Input<String> contains = Input.absent();

    private Input<String> notContains = Input.absent();

    private Input<List<String>> between = Input.absent();

    private Input<String> beginsWith = Input.absent();

    Builder() {
    }

    public Builder ne(@Nullable String ne) {
      this.ne = Input.fromNullable(ne);
      return this;
    }

    public Builder eq(@Nullable String eq) {
      this.eq = Input.fromNullable(eq);
      return this;
    }

    public Builder le(@Nullable String le) {
      this.le = Input.fromNullable(le);
      return this;
    }

    public Builder lt(@Nullable String lt) {
      this.lt = Input.fromNullable(lt);
      return this;
    }

    public Builder ge(@Nullable String ge) {
      this.ge = Input.fromNullable(ge);
      return this;
    }

    public Builder gt(@Nullable String gt) {
      this.gt = Input.fromNullable(gt);
      return this;
    }

    public Builder contains(@Nullable String contains) {
      this.contains = Input.fromNullable(contains);
      return this;
    }

    public Builder notContains(@Nullable String notContains) {
      this.notContains = Input.fromNullable(notContains);
      return this;
    }

    public Builder between(@Nullable List<String> between) {
      this.between = Input.fromNullable(between);
      return this;
    }

    public Builder beginsWith(@Nullable String beginsWith) {
      this.beginsWith = Input.fromNullable(beginsWith);
      return this;
    }

    public ModelIDFilterInput build() {
      return new ModelIDFilterInput(ne, eq, le, lt, ge, gt, contains, notContains, between, beginsWith);
    }
  }
}
