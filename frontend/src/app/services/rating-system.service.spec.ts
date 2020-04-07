import { TestBed } from '@angular/core/testing';

import { RatingSystemService } from './rating-system.service';

describe('RatingSystemService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: RatingSystemService = TestBed.get(RatingSystemService);
    expect(service).toBeTruthy();
  });
});
