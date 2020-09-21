import moment from 'moment';

export const formatdate = (date: string) => {
  return moment(date).format('DD/MM/YYYY HH:mm');
}