package type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("Apollo GraphQL")
public final class DeleteTodoInput implements InputType {
  private final Input<String> id;

  DeleteTodoInput(Input<String> id) {
    this.id = id;
  }

  public @Nullable String id() {
    return this.id.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (id.defined) {
          writer.writeString("id", id.value);
        }
      }
    };
  }

  public static final class Builder {
    private Input<String> id = Input.absent();

    Builder() {
    }

    public Builder id(@Nullable String id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public DeleteTodoInput build() {
      return new DeleteTodoInput(id);
    }
  }
}
