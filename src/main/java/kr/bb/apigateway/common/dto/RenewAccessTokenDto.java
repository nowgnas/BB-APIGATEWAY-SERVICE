package kr.bb.apigateway.common.dto;


import kr.bb.apigateway.common.valueobject.BaseId;
import kr.bb.apigateway.common.valueobject.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RenewAccessTokenDto<T extends BaseId> {
  T authId;
  Role role;

}
