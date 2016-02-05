package repotest.app.server.service;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.bean.ResponseBean;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import com.athena.framework.server.exception.repository.SpartanTransactionException;
import java.util.List;
import org.springframework.http.HttpEntity;
import repotest.app.shared.authentication.PasswordPolicy;
import java.util.Map;
import com.athena.framework.server.bean.FindByBean;

@SourceCodeAuthorClass(createdBy = "root", updatedBy = "", versionNumber = "1", comments = "Service for PasswordPolicy Master table Entity", complexity = Complexity.LOW)
public abstract class PasswordPolicyService {

    public HttpEntity<ResponseBean> save(PasswordPolicy entity) throws Exception, SpartanTransactionException, SpartanPersistenceException {
        return null;
    }

    public HttpEntity<ResponseBean> save(List<PasswordPolicy> entity, boolean isArray) throws Exception, SpartanTransactionException, SpartanPersistenceException {
        return null;
    }

    public HttpEntity<ResponseBean> delete(String id) throws SpartanTransactionException, SpartanPersistenceException, Exception {
        return null;
    }

    public HttpEntity<ResponseBean> update(PasswordPolicy entity) throws SpartanTransactionException, SpartanPersistenceException, Exception {
        return null;
    }

    public HttpEntity<ResponseBean> update(List<PasswordPolicy> entity, boolean isArray) throws SpartanTransactionException, SpartanPersistenceException, Exception {
        return null;
    }

    public HttpEntity<ResponseBean> search(Map<String, Object> fieldData) throws Exception, SpartanPersistenceException {
        return null;
    }

    public HttpEntity<ResponseBean> findById(FindByBean findByBean) throws SpartanPersistenceException, Exception {
        return null;
    }
}
