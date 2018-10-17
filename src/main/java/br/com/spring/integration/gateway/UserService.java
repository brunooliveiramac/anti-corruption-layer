package br.com.spring.integration.gateway;

import br.com.spring.integration.types.UserRequest;
import br.com.spring.integration.types.UserResponse;
import org.springframework.integration.annotation.Gateway;

public interface UserService {

	/**
	 * Entry to the messaging system. All invocations to this method will be intercepted and sent to the SI "system entry" gateway
	 *
	 * @param request
	 */

	@Gateway
	UserResponse invoke(UserRequest request);
}
