package service;

import org.h2.api.ErrorCode;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import repository.ApartmentRepository;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceOrThrow(Long apartmentId) {
        // FIXME: Create Exception.
        // FIXME: Create Exception.
        return apartmentRepository.findById(apartmentId)
                .orElseThrow(new HouseException(ErrorCode.ACCESS_DENIED_TO_CLASS_1))
                .getPrice();
    }
}
